var BackgroundClass = Quill.import('attributors/class/background');
var ColorClass = Quill.import('attributors/class/color');
var SizeStyle = Quill.import('attributors/style/size');
Quill.register(BackgroundClass, true);
Quill.register(ColorClass, true);
Quill.register(SizeStyle, true);

var quill = new Quill('#editor-container', {
  modules: {
    toolbar: '#toolbar-container'
  },
  placeholder: 'Compose an epic...',
  theme: 'snow'
});
