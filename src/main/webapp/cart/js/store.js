var DDM;
(function(k, l) {
	var m = (function() {
		var j = "[dd-cross-message]",
			supportPostMessage = 'postMessage' in k;

		function Target(a, b, c) {
			var d = '';
			if (arguments.length < 2) {
				d = 'target error - target and name are both required'
			} else if (typeof a != 'object') {
				d = 'target error - target itself must be window object'
			} else if (typeof b != 'string') {
				d = 'target error - target name must be string type'
			}
			if (d) {
				throw new Error(d);
			}
			this.target = a;
			this.name = b;
			this.prefix = c
		}
		if (supportPostMessage) {
			Target.prototype.send = function(a) {
				this.target.postMessage(this.prefix + '|' + this.name + '__Messenger__' + a, '*')
			}
		} else {
			Target.prototype.send = function(a) {
				var b = k.navigator[this.prefix + this.name];
				if (typeof b == 'function') {
					b(this.prefix + '|' + this.name + '__Messenger__' + a, k)
				} else {
					throw new Error("target callback function is not defined");
				}
			}
		}

		function m(a, b) {
			this.targets = {};
			this.name = a;
			this.listenFunc = [];
			this.prefix = b || j;
			this.initListen()
		}
		m.prototype.addTarget = function(a, b) {
			var c = new Target(a, b, this.prefix);
			this.targets[b] = c
		};
		m.prototype.initListen = function() {
			var g = this;
			var h = function(a) {
				var b;
				if (typeof a == 'object' && a.data) {
					b = a.data;
					if (typeof b == 'string') {
						var c = b.split('__Messenger__');
						b = c[1];
						var d = c[0].split('|');
						var e = d[0];
						var f = d[1];
						for (var i = 0; i < g.listenFunc.length; i++) {
							if (e + f == g.prefix + g.name) {
								g.listenFunc[i](b)
							}
						}
					}
				}
			};
			if (supportPostMessage) {
				if ('addEventListener' in document) {
					k.addEventListener('message', h, false)
				} else if ('attachEvent' in document) {
					k.attachEvent('onmessage', h)
				}
			} else {
				k.navigator[this.prefix + this.name] = h
			}
		};
		m.prototype.listen = function(a) {
			var b = this.listenFunc.length;
			var c = false;
			for (var i = 0; i < b; i++) {
				if (this.listenFunc[i] == a) {
					c = true;
					break
				}
			}
			if (!c) {
				this.listenFunc.push(a)
			}
		};
		m.prototype.clear = function() {
			this.listenFunc = []
		};
		m.prototype.send = function(a) {
			var b = this.targets,
				target;
			for (target in b) {
				if (b.hasOwnProperty(target)) {
					b[target].send(a)
				}
			}
		};
		return m
	})();
	var F = DDF;
	var n = (function() {
		var a = new Date();
		var b = a.getFullYear();
		var c = a.getMonth() + 1;
		var d = a.getDate();
		return '?' + b + c + d
	})();
	var o = 'https://databack.dangdang.com/proxy.html' + n;
	var p = function() {
		this.projectName = 'dd-cross-message';
		this.iframe = false;
		this.messenger = false;
		this.messengerTargetName = 'dd-message-iframe';
		this.proxyUrl = o;
		this.queue = {};
		this.isReady = false;
		this.sendPromise = {}
	};
	p.prototype = {
		ready: function() {
			var c = this;
			if (this.iframe === false) {
				var d = F.Deferred();
				var e = document.createElement('iframe');
				e.src = c.proxyUrl;
				e.width = '1px';
				e.height = '1px';
				e.style.border = 'none';
				e.style.display = 'none';
				var f = new m('parent', c.projectName);
				c.messenger = f;

				function load() {
					c.messenger.listen(function(a) {
						var b = JSON.parse(a);
						c.queue[b.id] = b;
						if (c.sendPromise[b.id] && c.sendPromise[b.id].doneList.length > 0) {
							c.sendPromise[b.id].resolve(b.id);
							delete c.sendPromise[b.id]
						} else {
							function loop() {
								if (c.sendPromise[b.id] && c.sendPromise[b.id].doneList.length > 0) {
									c.sendPromise[b.id].resolve(b.id);
									delete c.sendPromise[b.id]
								} else {
									k.setTimeout(loop, 1)
								}
							}
							k.setTimeout(loop, 1)
						}
					});
					c.isReady = true;
					d.resolve()
				}
				if (e.attachEvent) {
					e.attachEvent('onload', load)
				} else {
					e.onload = load
				}
				document.body.appendChild(e);
				c.iframe = e;
				return d
			}
		},
		send: function(a) {
			var b = this;
			var c = {
				act: 'get',
				key: '',
				value: '',
				id: F.createPid()
			};
			a = F.extend(c, a);
			b.sendPromise[a.id] = F.Deferred();
			b.messenger.addTarget(b.iframe.contentWindow, b.messengerTargetName);
			b.messenger.targets[b.messengerTargetName].send(JSON.stringify(a));
			return b.sendPromise[a.id]
		},
		get: function(a) {
			var b = this;
			return b.queue[a] && b.queue[a]['value'] ? b.queue[a]['value'] : null
		}
	};
	k.DDM = new p()
})(window);
var DDS;
(function(h, j) {
	var F = DDF;
	var M = DDM;
	var T = DDT;
	var S = {};
	S.isReady = false;
	S.isCreatIframe = false;
	S.readyList = [];
	S.ready = function(d) {
		if (S.isCreatIframe == false) {
			S.isCreatIframe = true;
			S.readyList.push(d);
			M.ready().then(function() {
				var c = F.cookie({
					key: T.__ddc_rpm
				}) || '';
				if (c !== '') {
					S.store.get(T.__rpm_key).then(function(a) {
						var b = M.get(a);
						S.setRpm(b, c)
					})
				} else {
					S.store.remove(T.__rpm_key).then(function(a) {
						S.isReady = true;
						T.__rpms = '';
						if (S.readyList.length > 0) {
							for (var i = 0; i < S.readyList.length; i++) {
								if (typeof S.readyList[i] == 'function') {
									S.readyList[i].call(document);
									delete S.readyList[i]
								}
							}
						}
					})
				}
			})
		} else if (S.isReady == false) {
			S.readyList.push(d)
		} else {
			d.call(this)
		}
	};
	S.store = {
		get: function() {
			var a = arguments.length == 1 ? arguments[0] : T.__rpm_key;
			var b = {
				act: 'get',
				key: a
			};
			return M.send(b)
		},
		set: function() {
			if (arguments.length >= 1) {
				var a = arguments.length == 2 ? arguments[0] : T.__rpm_key,
					value = arguments.length == 2 ? arguments[1] : arguments[0],
					data = {
						act: 'set',
						key: a,
						value: value
					};
				return M.send(data)
			}
			return false
		},
		remove: function() {
			var a = arguments.length == 1 ? arguments[0] : T.__rpm_key;
			var b = {
				act: 'remove',
				key: a
			};
			return M.send(b)
		}
	};
	S.setRpm = function(d, e) {
		var f = T.__rpm_max;
		var g = T.__rpm_split;
		if (e) {
			if (d) {
				if (F.inArray(e, d) < 0) {
					if (d.length == f) {
						d.shift()
					}
					d.push(e)
				}
			} else {
				d = [];
				d.push(e)
			}
			S.store.set(T.__rpm_key, d).then(function(a) {
				S.isReady = true;
				T.__rpms = d;
				var b = e.slice(e.indexOf(T.__rpm_split) + 1);
				T.__rpms_line = S.rpmLine(d, b);
				var c = S.readyList.slice();
				if (c) {
					for (var i = 0; i < c.length; i++) {
						if (typeof c[i] == 'function') {
							c[i].call(document);
							S.readyList.shift()
						}
					}
				}
			})
		}
	};
	S.rpmLine = function(a, b) {
		var c = b ? b : '';
		var d = b;
		var e = T.__rpm_split;
		if (a && b) {
			for (var i = Number(a.length) - 1; i >= 0; i--) {
				var f = '',
					last = '';
				if (a[i].indexOf(e) > 0) {
					f = a[i].slice(0, a[i].indexOf(e));
					last = a[i].slice(a[i].indexOf(e) + 1)
				} else {
					last = a[i]
				}
				if (f == '') {
					break
				}
				if (d == '') {
					c = f + e + last;
					d = f
				}
				if (last == d) {
					c = f + e + c;
					d = f
				}
			}
			return c
		}
		return c
	};
	S.init = function() {
		S.ready(function() {});
		if (typeof DDT != 'undefined' && typeof DDT.Api != 'undefined') {
			DDT.Api.getRpms = function(c) {
				S.ready(function() {
					var a = T.lastRpm();
					var b = S.rpmLine(T.__rpms, a);
					b ? c.call(this, b) : ''
				})
			}
		}
	};
	h.DDS = S;
	DDS.init()
})(window);
