var quill = new Quill('#editor', {
    theme: 'snow',
     modules: {
        imageDrop: true
        imageResize: {
          modules: [resize, displaysize, toolbar]
        }
    }
});
