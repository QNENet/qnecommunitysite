!(function (e, t) {
  if ("object" == typeof exports && "object" == typeof module)
    module.exports = t();
  else if ("function" == typeof define && define.amd) define([], t);
  else {
    var n = t();
    for (var r in n) ("object" == typeof exports ? exports : e)[r] = n[r];
  }
})(window, function () {
  return (function (e) {
    var t = {};
    function n(r) {
      if (t[r]) return t[r].exports;
      var i = (t[r] = { i: r, l: !1, exports: {} });
      return e[r].call(i.exports, i, i.exports, n), (i.l = !0), i.exports;
    }
    return (
      (n.m = e),
      (n.c = t),
      (n.d = function (e, t, r) {
        n.o(e, t) || Object.defineProperty(e, t, { enumerable: !0, get: r });
      }),
      (n.r = function (e) {
        "undefined" != typeof Symbol &&
          Symbol.toStringTag &&
          Object.defineProperty(e, Symbol.toStringTag, { value: "Module" }),
          Object.defineProperty(e, "__esModule", { value: !0 });
      }),
      (n.t = function (e, t) {
        if ((1 & t && (e = n(e)), 8 & t)) return e;
        if (4 & t && "object" == typeof e && e && e.__esModule) return e;
        var r = Object.create(null);
        if (
          (n.r(r),
          Object.defineProperty(r, "default", { enumerable: !0, value: e }),
          2 & t && "string" != typeof e)
        )
          for (var i in e)
            n.d(
              r,
              i,
              function (t) {
                return e[t];
              }.bind(null, i)
            );
        return r;
      }),
      (n.n = function (e) {
        var t =
          e && e.__esModule
            ? function () {
                return e.default;
              }
            : function () {
                return e;
              };
        return n.d(t, "a", t), t;
      }),
      (n.o = function (e, t) {
        return Object.prototype.hasOwnProperty.call(e, t);
      }),
      (n.p = "/dist/"),
      n((n.s = 1))
    );
  })([
    function (e, t, n) {
      "use strict";
      var r =
          (this && this.__awaiter) ||
          function (e, t, n, r) {
            return new (n || (n = Promise))(function (i, o) {
              function a(e) {
                try {
                  u(r.next(e));
                } catch (e) {
                  o(e);
                }
              }
              function l(e) {
                try {
                  u(r.throw(e));
                } catch (e) {
                  o(e);
                }
              }
              function u(e) {
                var t;
                e.done
                  ? i(e.value)
                  : ((t = e.value),
                    t instanceof n
                      ? t
                      : new n(function (e) {
                          e(t);
                        })).then(a, l);
              }
              u((r = r.apply(e, t || [])).next());
            });
          },
        i =
          (this && this.__generator) ||
          function (e, t) {
            var n,
              r,
              i,
              o,
              a = {
                label: 0,
                sent: function () {
                  if (1 & i[0]) throw i[1];
                  return i[1];
                },
                trys: [],
                ops: [],
              };
            return (
              (o = { next: l(0), throw: l(1), return: l(2) }),
              "function" == typeof Symbol &&
                (o[Symbol.iterator] = function () {
                  return this;
                }),
              o
            );
            function l(l) {
              return function (u) {
                return (function (l) {
                  if (n) throw new TypeError("Generator is already executing.");
                  for (; o && ((o = 0), l[0] && (a = 0)), a; )
                    try {
                      if (
                        ((n = 1),
                        r &&
                          (i =
                            2 & l[0]
                              ? r.return
                              : l[0]
                              ? r.throw || ((i = r.return) && i.call(r), 0)
                              : r.next) &&
                          !(i = i.call(r, l[1])).done)
                      )
                        return i;
                      switch (((r = 0), i && (l = [2 & l[0], i.value]), l[0])) {
                        case 0:
                        case 1:
                          i = l;
                          break;
                        case 4:
                          return a.label++, { value: l[1], done: !1 };
                        case 5:
                          a.label++, (r = l[1]), (l = [0]);
                          continue;
                        case 7:
                          (l = a.ops.pop()), a.trys.pop();
                          continue;
                        default:
                          if (
                            !((i = a.trys),
                            (i = i.length > 0 && i[i.length - 1]) ||
                              (6 !== l[0] && 2 !== l[0]))
                          ) {
                            a = 0;
                            continue;
                          }
                          if (
                            3 === l[0] &&
                            (!i || (l[1] > i[0] && l[1] < i[3]))
                          ) {
                            a.label = l[1];
                            break;
                          }
                          if (6 === l[0] && a.label < i[1]) {
                            (a.label = i[1]), (i = l);
                            break;
                          }
                          if (i && a.label < i[2]) {
                            (a.label = i[2]), a.ops.push(l);
                            break;
                          }
                          i[2] && a.ops.pop(), a.trys.pop();
                          continue;
                      }
                      l = t.call(e, a);
                    } catch (e) {
                      (l = [6, e]), (r = 0);
                    } finally {
                      n = i = 0;
                    }
                  if (5 & l[0]) throw l[1];
                  return { value: l[0] ? l[1] : void 0, done: !0 };
                })([l, u]);
              };
            }
          };
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.file2b64 = void 0),
        (t.file2b64 = function (e) {
          return r(this, void 0, void 0, function () {
            var t, n;
            return i(this, function (r) {
              return (
                (t = new FileReader()),
                (n = new Promise(function (e, n) {
                  t.addEventListener(
                    "load",
                    function () {
                      var r,
                        i =
                          null === (r = t.result) || void 0 === r
                            ? void 0
                            : r.toString();
                      i ? e(i) : n("could not convert file to base64");
                    },
                    !1
                  );
                })),
                t.readAsDataURL(e),
                [2, n]
              );
            });
          });
        });
    },
    function (e, t, n) {
      "use strict";
      var r =
          (this && this.__awaiter) ||
          function (e, t, n, r) {
            return new (n || (n = Promise))(function (i, o) {
              function a(e) {
                try {
                  u(r.next(e));
                } catch (e) {
                  o(e);
                }
              }
              function l(e) {
                try {
                  u(r.throw(e));
                } catch (e) {
                  o(e);
                }
              }
              function u(e) {
                var t;
                e.done
                  ? i(e.value)
                  : ((t = e.value),
                    t instanceof n
                      ? t
                      : new n(function (e) {
                          e(t);
                        })).then(a, l);
              }
              u((r = r.apply(e, t || [])).next());
            });
          },
        i =
          (this && this.__generator) ||
          function (e, t) {
            var n,
              r,
              i,
              o,
              a = {
                label: 0,
                sent: function () {
                  if (1 & i[0]) throw i[1];
                  return i[1];
                },
                trys: [],
                ops: [],
              };
            return (
              (o = { next: l(0), throw: l(1), return: l(2) }),
              "function" == typeof Symbol &&
                (o[Symbol.iterator] = function () {
                  return this;
                }),
              o
            );
            function l(l) {
              return function (u) {
                return (function (l) {
                  if (n) throw new TypeError("Generator is already executing.");
                  for (; o && ((o = 0), l[0] && (a = 0)), a; )
                    try {
                      if (
                        ((n = 1),
                        r &&
                          (i =
                            2 & l[0]
                              ? r.return
                              : l[0]
                              ? r.throw || ((i = r.return) && i.call(r), 0)
                              : r.next) &&
                          !(i = i.call(r, l[1])).done)
                      )
                        return i;
                      switch (((r = 0), i && (l = [2 & l[0], i.value]), l[0])) {
                        case 0:
                        case 1:
                          i = l;
                          break;
                        case 4:
                          return a.label++, { value: l[1], done: !1 };
                        case 5:
                          a.label++, (r = l[1]), (l = [0]);
                          continue;
                        case 7:
                          (l = a.ops.pop()), a.trys.pop();
                          continue;
                        default:
                          if (
                            !((i = a.trys),
                            (i = i.length > 0 && i[i.length - 1]) ||
                              (6 !== l[0] && 2 !== l[0]))
                          ) {
                            a = 0;
                            continue;
                          }
                          if (
                            3 === l[0] &&
                            (!i || (l[1] > i[0] && l[1] < i[3]))
                          ) {
                            a.label = l[1];
                            break;
                          }
                          if (6 === l[0] && a.label < i[1]) {
                            (a.label = i[1]), (i = l);
                            break;
                          }
                          if (i && a.label < i[2]) {
                            (a.label = i[2]), a.ops.push(l);
                            break;
                          }
                          i[2] && a.ops.pop(), a.trys.pop();
                          continue;
                      }
                      l = t.call(e, a);
                    } catch (e) {
                      (l = [6, e]), (r = 0);
                    } finally {
                      n = i = 0;
                    }
                  if (5 & l[0]) throw l[1];
                  return { value: l[0] ? l[1] : void 0, done: !0 };
                })([l, u]);
              };
            }
          };
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.imageCompressor = void 0);
      var o = n(2),
        a = n(3),
        l = n(0),
        u = n(4),
        s = n(5),
        c = (function () {
          function e(t, n) {
            var l = this;
            (this.quill = t), (this.options = n || {});
            var u = !!n.debug,
              c = !!n.suppressErrorLogging;
            (this.Logger = new s.ConsoleLogger(u, c)),
              (0, a.warnAboutOptions)(n, this.Logger);
            (this.imageDrop = new o.ImageDrop(
              t,
              function (t) {
                return r(l, void 0, void 0, function () {
                  var n;
                  return i(this, function (r) {
                    switch (r.label) {
                      case 0:
                        return (
                          this.Logger.log("onImageDrop", { dataUrl: t }),
                          [4, this.downscaleImageFromUrl(t)]
                        );
                      case 1:
                        return (
                          (n = r.sent()),
                          this.insertToEditor(n, e.b64toBlob(n)),
                          [2]
                        );
                    }
                  });
                });
              },
              this.Logger
            )),
              this.Logger.log("fileChanged", {
                options: n,
                quill: t,
                debug: u,
              });
            var f = this.quill.getModule("toolbar");
            f
              ? f.addHandler("image", function () {
                  return l.selectLocalImage();
                })
              : this.Logger.error(
                  "Quill toolbar module not found! need { toolbar: // options } in Quill.modules for image icon to sit in"
                );
          }
          return (
            (e.b64toBlob = function (e) {
              for (
                var t = atob(e.split(",")[1]),
                  n = e.slice(5).split(";")[0],
                  r = new ArrayBuffer(t.length),
                  i = new Uint8Array(r),
                  o = 0;
                o < t.length;
                o++
              )
                i[o] = t.charCodeAt(o);
              return new Blob([r], { type: n });
            }),
            (e.prototype.selectLocalImage = function (e) {
              var t = this;
              (this.range = this.quill.getSelection()),
                (this.fileHolder = document.createElement("input")),
                this.fileHolder.setAttribute("type", "file"),
                this.fileHolder.setAttribute("accept", "image/*"),
                this.fileHolder.setAttribute("style", "visibility:hidden"),
                (this.fileHolder.onchange = function () {
                  return t.fileChanged().then(function () {
                    return e && e();
                  });
                }),
                document.body.appendChild(this.fileHolder),
                this.fileHolder.click(),
                window.requestAnimationFrame(function () {
                  t.fileHolder && document.body.removeChild(t.fileHolder);
                });
            }),
            (e.prototype.fileChanged = function (t) {
              var n;
              return r(this, void 0, void 0, function () {
                var r, o, a, u;
                return i(this, function (i) {
                  switch (i.label) {
                    case 0:
                      return (r =
                        t ||
                        (null === (n = this.fileHolder) || void 0 === n
                          ? void 0
                          : n.files)) && r.length
                        ? ((o = r[0]),
                          this.Logger.log("fileChanged", { file: o }),
                          o ? [4, (0, l.file2b64)(o)] : [2])
                        : [2];
                    case 1:
                      return (a = i.sent()), [4, this.downscaleImageFromUrl(a)];
                    case 2:
                      return (
                        (u = i.sent()),
                        this.insertToEditor(u, e.b64toBlob(u)),
                        [2]
                      );
                  }
                });
              });
            }),
            (e.prototype.downscaleImageFromUrl = function (e) {
              return r(this, void 0, void 0, function () {
                var t;
                return i(this, function (n) {
                  switch (n.label) {
                    case 0:
                      return [
                        4,
                        (0, u.downscaleImage)(
                          this.Logger,
                          e,
                          this.options.maxWidth,
                          this.options.maxHeight,
                          this.options.imageType,
                          this.options.keepImageTypes,
                          this.options.ignoreImageTypes,
                          this.options.quality
                        ),
                      ];
                    case 1:
                      return (
                        (t = n.sent()),
                        this.Logger.log("downscaleImageFromUrl", {
                          dataUrl: e,
                          dataUrlCompressed: t,
                        }),
                        [2, t]
                      );
                  }
                });
              });
            }),
            (e.prototype.insertToEditor = function (e, t) {
              if (this.options.insertIntoEditor)
                this.options.insertIntoEditor(e, t, this.quill);
              else {
                this.Logger.log("insertToEditor", { url: e }),
                  (this.range = this.quill.getSelection());
                var n = this.range;
                if (!n) return;
                this.logFileSize(e),
                  this.quill.insertEmbed(
                    n.index,
                    "image",
                    "".concat(e),
                    "user"
                  ),
                  n.index++,
                  this.quill.setSelection(n, "api");
              }
            }),
            (e.prototype.logFileSize = function (e) {
              var t = (
                Math.round(
                  (3 * (e.length - "data:image/png;base64,".length)) / 4
                ) / 1024
              ).toFixed(0);
              this.Logger.log("estimated img size: " + t + " kb");
            }),
            e
          );
        })();
      (t.imageCompressor = c), (window.imageCompressor = c), (t.default = c);
    },
    function (e, t, n) {
      "use strict";
      var r =
          (this && this.__awaiter) ||
          function (e, t, n, r) {
            return new (n || (n = Promise))(function (i, o) {
              function a(e) {
                try {
                  u(r.next(e));
                } catch (e) {
                  o(e);
                }
              }
              function l(e) {
                try {
                  u(r.throw(e));
                } catch (e) {
                  o(e);
                }
              }
              function u(e) {
                var t;
                e.done
                  ? i(e.value)
                  : ((t = e.value),
                    t instanceof n
                      ? t
                      : new n(function (e) {
                          e(t);
                        })).then(a, l);
              }
              u((r = r.apply(e, t || [])).next());
            });
          },
        i =
          (this && this.__generator) ||
          function (e, t) {
            var n,
              r,
              i,
              o,
              a = {
                label: 0,
                sent: function () {
                  if (1 & i[0]) throw i[1];
                  return i[1];
                },
                trys: [],
                ops: [],
              };
            return (
              (o = { next: l(0), throw: l(1), return: l(2) }),
              "function" == typeof Symbol &&
                (o[Symbol.iterator] = function () {
                  return this;
                }),
              o
            );
            function l(l) {
              return function (u) {
                return (function (l) {
                  if (n) throw new TypeError("Generator is already executing.");
                  for (; o && ((o = 0), l[0] && (a = 0)), a; )
                    try {
                      if (
                        ((n = 1),
                        r &&
                          (i =
                            2 & l[0]
                              ? r.return
                              : l[0]
                              ? r.throw || ((i = r.return) && i.call(r), 0)
                              : r.next) &&
                          !(i = i.call(r, l[1])).done)
                      )
                        return i;
                      switch (((r = 0), i && (l = [2 & l[0], i.value]), l[0])) {
                        case 0:
                        case 1:
                          i = l;
                          break;
                        case 4:
                          return a.label++, { value: l[1], done: !1 };
                        case 5:
                          a.label++, (r = l[1]), (l = [0]);
                          continue;
                        case 7:
                          (l = a.ops.pop()), a.trys.pop();
                          continue;
                        default:
                          if (
                            !((i = a.trys),
                            (i = i.length > 0 && i[i.length - 1]) ||
                              (6 !== l[0] && 2 !== l[0]))
                          ) {
                            a = 0;
                            continue;
                          }
                          if (
                            3 === l[0] &&
                            (!i || (l[1] > i[0] && l[1] < i[3]))
                          ) {
                            a.label = l[1];
                            break;
                          }
                          if (6 === l[0] && a.label < i[1]) {
                            (a.label = i[1]), (i = l);
                            break;
                          }
                          if (i && a.label < i[2]) {
                            (a.label = i[2]), a.ops.push(l);
                            break;
                          }
                          i[2] && a.ops.pop(), a.trys.pop();
                          continue;
                      }
                      l = t.call(e, a);
                    } catch (e) {
                      (l = [6, e]), (r = 0);
                    } finally {
                      n = i = 0;
                    }
                  if (5 & l[0]) throw l[1];
                  return { value: l[0] ? l[1] : void 0, done: !0 };
                })([l, u]);
              };
            }
          };
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.ImageDrop = void 0);
      var o = n(0),
        a = (function () {
          function e(e, t, n) {
            var r = this;
            (this.quill = e),
              (this.onNewDataUrl = t),
              (this.logger = n),
              this.quill.root.addEventListener(
                "drop",
                function (e) {
                  return r.handleDrop(e);
                },
                !1
              ),
              this.quill.root.addEventListener(
                "paste",
                function (e) {
                  return r.handlePaste(e);
                },
                !1
              );
          }
          return (
            (e.prototype.handleDrop = function (e) {
              return r(this, void 0, void 0, function () {
                var t, n, r, a, c, f, g;
                return i(this, function (i) {
                  switch (i.label) {
                    case 0:
                      return (
                        e.preventDefault(),
                        document.caretRangeFromPoint &&
                          ((t = document.getSelection()),
                          (n = document.caretRangeFromPoint(
                            e.clientX,
                            e.clientY
                          )),
                          t &&
                            n &&
                            t.setBaseAndExtent(
                              n.startContainer,
                              n.startOffset,
                              n.startContainer,
                              n.startOffset
                            )),
                        [4, u(e)]
                      );
                    case 1:
                      return (
                        (r = i.sent()),
                        (a = Array.from(r || []).filter(function (e) {
                          return s(e.type);
                        })),
                        (c = null == a ? void 0 : a[0])
                          ? [4, (0, o.file2b64)(c)]
                          : [3, 3]
                      );
                    case 2:
                      return (
                        (g = i.sent()),
                        this.logger.log("handleNewImageFiles", {
                          evt: e,
                          files: r,
                          filesFiltered: a,
                          firstImage: c,
                          base64ImageSrc: g,
                        }),
                        this.onNewDataUrl(g),
                        [2]
                      );
                    case 3:
                      return [4, l(e)];
                    case 4:
                      return (f = i.sent()) ? [4, (0, o.file2b64)(f)] : [3, 6];
                    case 5:
                      return (
                        (g = i.sent()),
                        this.logger.log("handleNewImageFiles", {
                          evt: e,
                          blob: f,
                          base64ImageSrc: g,
                        }),
                        this.onNewDataUrl(g),
                        [2]
                      );
                    case 6:
                      return [2];
                  }
                });
              });
            }),
            (e.prototype.handlePaste = function (e) {
              var t, n;
              return r(this, void 0, void 0, function () {
                var r, a, l, u;
                return i(this, function (i) {
                  switch (i.label) {
                    case 0:
                      return (
                        (r = Array.from(
                          (null ===
                            (t = null == e ? void 0 : e.clipboardData) ||
                          void 0 === t
                            ? void 0
                            : t.items) || []
                        )),
                        this.logger.log("handlePaste", { files: r, evt: e }),
                        (a = r.filter(function (e) {
                          return s(e.type);
                        })),
                        this.logger.log("handlePaste", { images: a, evt: e }),
                        a.length
                          ? a.filter(function (e) {
                              return "text/html" !== e.type;
                            }).length
                            ? (e.preventDefault(),
                              (l =
                                null === (n = a.pop()) || void 0 === n
                                  ? void 0
                                  : n.getAsFile())
                                ? [4, (0, o.file2b64)(l)]
                                : [2])
                            : (this.logger.log(
                                "handlePaste also detected html"
                              ),
                              [2])
                          : [2]
                      );
                    case 1:
                      return (
                        (u = i.sent()),
                        this.logger.log("handleNewImageFiles", {
                          base64ImageSrc: u,
                        }),
                        this.onNewDataUrl(u),
                        [2]
                      );
                  }
                });
              });
            }),
            e
          );
        })();
      function l(e) {
        var t;
        return r(this, void 0, void 0, function () {
          var n;
          return i(this, function (r) {
            switch (r.label) {
              case 0:
                return (n =
                  null === (t = e.dataTransfer) || void 0 === t
                    ? void 0
                    : t.getData("URL"))
                  ? [4, fetch(n)]
                  : [3, 3];
              case 1:
                return [4, r.sent().blob()];
              case 2:
                return [2, r.sent()];
              case 3:
                return [2];
            }
          });
        });
      }
      function u(e) {
        var t;
        return r(this, void 0, void 0, function () {
          return i(this, function (n) {
            return [
              2,
              null === (t = null == e ? void 0 : e.dataTransfer) || void 0 === t
                ? void 0
                : t.files,
            ];
          });
        });
      }
      function s(e) {
        return !!e.match(/^image\/(gif|jpe?g|a?png|svg|webp|bmp)/i);
      }
      t.ImageDrop = a;
    },
    function (e, t, n) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.warnAboutOptions = void 0),
        (t.warnAboutOptions = function (e, t) {
          (e.maxWidth = e.maxWidth || 1e3),
            (e.maxHeight = e.maxHeight || 1e3),
            e.maxWidth &&
              "number" != typeof e.maxWidth &&
              (t.warn(
                "[config error] 'maxWidth' is required to be a \"number\" (in pixels), \nreceived: ".concat(
                  e.maxWidth,
                  "\n-> using default 1000"
                )
              ),
              (e.maxWidth = 1e3)),
            e.maxHeight &&
              "number" != typeof e.maxHeight &&
              (t.warn(
                "[config error] 'maxHeight' is required to be a \"number\" (in pixels), \nreceived: ".concat(
                  e.maxHeight,
                  "\n-> using default 1000"
                )
              ),
              (e.maxHeight = 1e3)),
            e.quality &&
              "number" != typeof e.quality &&
              (t.warn(
                "quill.imageCompressor: [config error] 'quality' is required to be a \"number\", \nreceived: ".concat(
                  e.quality,
                  "\n-> using default 0.7"
                )
              ),
              (e.quality = 0.7)),
            !e.imageType ||
              ("string" == typeof e.imageType &&
                e.imageType.startsWith("image/")) ||
              (t.warn(
                'quill.imageCompressor: [config error] \'imageType\' is required be in the form of "image/png" or "image/jpeg" etc ..., \nreceived: '.concat(
                  e.imageType,
                  "\n-> using default image/jpeg"
                )
              ),
              (e.imageType = "image/jpeg")),
            e.keepImageTypes || (e.keepImageTypes = []),
            e.keepImageTypes &&
              !Array.isArray(e.keepImageTypes) &&
              (t.warn(
                "quill.imageCompressor: [config error] 'keepImageTypes' is required to be a \"array\", received: ".concat(
                  e.keepImageTypes,
                  " -> using default []"
                )
              ),
              (e.keepImageTypes = [])),
            e.ignoreImageTypes || (e.ignoreImageTypes = []),
            e.ignoreImageTypes &&
              !Array.isArray(e.ignoreImageTypes) &&
              (t.warn(
                "quill.imageCompressor: [config error] 'ignoreImageTypes' is required to be a \"array\", received: ".concat(
                  e.ignoreImageTypes,
                  " -> using default []"
                )
              ),
              (e.ignoreImageTypes = [])),
            e.insertIntoEditor &&
              "function" != typeof e.insertIntoEditor &&
              (t.warn(
                "quill.imageCompressor: [config error] 'insertIntoEditor' is required to be a \"function\", received: ".concat(
                  e.insertIntoEditor,
                  " -> using default undefined"
                )
              ),
              (e.insertIntoEditor = void 0));
        });
    },
    function (e, t, n) {
      "use strict";
      var r =
          (this && this.__awaiter) ||
          function (e, t, n, r) {
            return new (n || (n = Promise))(function (i, o) {
              function a(e) {
                try {
                  u(r.next(e));
                } catch (e) {
                  o(e);
                }
              }
              function l(e) {
                try {
                  u(r.throw(e));
                } catch (e) {
                  o(e);
                }
              }
              function u(e) {
                var t;
                e.done
                  ? i(e.value)
                  : ((t = e.value),
                    t instanceof n
                      ? t
                      : new n(function (e) {
                          e(t);
                        })).then(a, l);
              }
              u((r = r.apply(e, t || [])).next());
            });
          },
        i =
          (this && this.__generator) ||
          function (e, t) {
            var n,
              r,
              i,
              o,
              a = {
                label: 0,
                sent: function () {
                  if (1 & i[0]) throw i[1];
                  return i[1];
                },
                trys: [],
                ops: [],
              };
            return (
              (o = { next: l(0), throw: l(1), return: l(2) }),
              "function" == typeof Symbol &&
                (o[Symbol.iterator] = function () {
                  return this;
                }),
              o
            );
            function l(l) {
              return function (u) {
                return (function (l) {
                  if (n) throw new TypeError("Generator is already executing.");
                  for (; o && ((o = 0), l[0] && (a = 0)), a; )
                    try {
                      if (
                        ((n = 1),
                        r &&
                          (i =
                            2 & l[0]
                              ? r.return
                              : l[0]
                              ? r.throw || ((i = r.return) && i.call(r), 0)
                              : r.next) &&
                          !(i = i.call(r, l[1])).done)
                      )
                        return i;
                      switch (((r = 0), i && (l = [2 & l[0], i.value]), l[0])) {
                        case 0:
                        case 1:
                          i = l;
                          break;
                        case 4:
                          return a.label++, { value: l[1], done: !1 };
                        case 5:
                          a.label++, (r = l[1]), (l = [0]);
                          continue;
                        case 7:
                          (l = a.ops.pop()), a.trys.pop();
                          continue;
                        default:
                          if (
                            !((i = a.trys),
                            (i = i.length > 0 && i[i.length - 1]) ||
                              (6 !== l[0] && 2 !== l[0]))
                          ) {
                            a = 0;
                            continue;
                          }
                          if (
                            3 === l[0] &&
                            (!i || (l[1] > i[0] && l[1] < i[3]))
                          ) {
                            a.label = l[1];
                            break;
                          }
                          if (6 === l[0] && a.label < i[1]) {
                            (a.label = i[1]), (i = l);
                            break;
                          }
                          if (i && a.label < i[2]) {
                            (a.label = i[2]), a.ops.push(l);
                            break;
                          }
                          i[2] && a.ops.pop(), a.trys.pop();
                          continue;
                      }
                      l = t.call(e, a);
                    } catch (e) {
                      (l = [6, e]), (r = 0);
                    } finally {
                      n = i = 0;
                    }
                  if (5 & l[0]) throw l[1];
                  return { value: l[0] ? l[1] : void 0, done: !0 };
                })([l, u]);
              };
            }
          };
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.downscaleImage = void 0),
        (t.downscaleImage = function (e, t, n, o, a, l, u, s) {
          return r(this, void 0, void 0, function () {
            var r, c, f, g, d, p, h, m;
            return i(this, function (i) {
              switch (i.label) {
                case 0:
                  return (
                    (r = t.split(";")[0].split(":")[1]),
                    (a = a || "image/jpeg"),
                    (s = s || 0.7),
                    ((c = new Image()).src = t),
                    [
                      4,
                      new Promise(function (e) {
                        c.onload = function () {
                          e();
                        };
                      }),
                    ]
                  );
                case 1:
                  return (
                    i.sent(),
                    (f = (function (e, t, n, r) {
                      if (n && r && e <= n && t <= r) return [e, t];
                      if (n && e > n) {
                        var i = n,
                          o = Math.floor((t / e) * i);
                        if (r && o > r) {
                          var a = r;
                          return [Math.floor((e / t) * a), a];
                        }
                        return [i, o];
                      }
                      if (r && t > r) {
                        o = r;
                        return [(i = Math.floor((e / t) * o)), o];
                      }
                      return [t, e];
                    })(c.width, c.height, n, o)),
                    (g = f[0]),
                    (d = f[1]),
                    ((p = document.createElement("canvas")).width = g),
                    (p.height = d),
                    (h = p.getContext("2d")),
                    "image/jpeg" === a &&
                      ((h.fillStyle = "#FFFFFF"),
                      h.fillRect(0, 0, c.width, c.height)),
                    (null == u ? void 0 : u.includes(r))
                      ? [2, t]
                      : ((null == l ? void 0 : l.includes(r)) && (a = r),
                        h.drawImage(c, 0, 0, g, d),
                        (m = p.toDataURL(a, s)),
                        e.log("downscaling image...", {
                          args: {
                            dataUrl: t,
                            maxWidth: n,
                            maxHeight: o,
                            imageType: a,
                            ignoreImageTypes: u,
                            keepImageTypes: l,
                            imageQuality: s,
                          },
                          newHeight: d,
                          newWidth: g,
                        }),
                        [2, m])
                  );
              }
            });
          });
        });
    },
    function (e, t, n) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.ConsoleLogger = void 0);
      var r = (function () {
        function e(e, t) {
          (this.debug = e), (this.suppressErrorLogging = t);
        }
        return (
          (e.prototype.prefixString = function () {
            return "</> quill-image-compress: ";
          }),
          Object.defineProperty(e.prototype, "log", {
            get: function () {
              return this.debug
                ? console.log.bind(console, this.prefixString())
                : function () {};
            },
            enumerable: !1,
            configurable: !0,
          }),
          Object.defineProperty(e.prototype, "error", {
            get: function () {
              return this.suppressErrorLogging
                ? function () {}
                : console.error.bind(console, this.prefixString());
            },
            enumerable: !1,
            configurable: !0,
          }),
          Object.defineProperty(e.prototype, "warn", {
            get: function () {
              return this.suppressErrorLogging
                ? function () {}
                : console.warn.bind(console, this.prefixString());
            },
            enumerable: !1,
            configurable: !0,
          }),
          e
        );
      })();
      t.ConsoleLogger = r;
    },
  ]);
});