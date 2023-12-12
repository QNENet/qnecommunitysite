// Get the source image to be edited
let image = document.getElementById("sourceImage");

// Get the canvas for the edited image
let canvas = document.getElementById("canvas");

// Get the 2D context of the image
let context = canvas.getContext("2d");
var ctx = canvas.getContext("2d");

// style the context
ctx.strokeStyle = "blue";
ctx.lineWidth = 3;

// calculate where the canvas is on the window
// (used to help calculate mouseX/mouseY)
var canvasOffset = canvas.getBoundingClientRect();
var offsetX = canvasOffset.left;
var offsetY = canvasOffset.top;

// this flage is true when the user is dragging the mouse
var isDown = false;

// these vars will hold the starting mouse position
var startX;
var startY;
var mouseX;
var mouseY;
var selectionRect = document.getElementById("selectionRect");

var x1 = 0;
var y1 = 0;
var x2 = 0;
var y2 = 0;
var dragging = false;

function getOffset() {
  canvasOffset = document.getElementById("canvas").getBoundingClientRect();
  offsetX = canvasOffset.offsetLeft;
  offsetY = canvasOffset.offsetTop;
}

// Get all the sliders of the image
let brightnessSlider = document.getElementById("brightnessSlider");
let contrastSlider = document.getElementById("contrastSlider");
let grayscaleSlider = document.getElementById("grayscaleSlider");
let hueRotateSlider = document.getElementById("hueRotateSlider");
let saturateSlider = document.getElementById("saturationSlider");
let sepiaSlider = document.getElementById("sepiaSlider");

function uploadImage(event) {
  // Set the source of the image from the uploaded file
  image.src = URL.createObjectURL(event.target.files[0]);

  image.onload = function () {
    // Set the canvas the same width and height of the image
    canvas.width = this.width;
    canvas.height = this.height;
    canvas.crossOrigin = "anonymous";
    applyFilter();
  };

  // Show the image editor controls and hide the help text
  document.querySelector(".help-text").style.display = "none";
  document.querySelector(".image-save").style.display = "block";
  document.querySelector(".image-controls").style.display = "block";
  document.querySelector(".preset-filters").style.display = "block";
}

// This function is used to update the image
// along with all the filter values
function applyFilter() {
  // Create a string that will contain all the filters
  // to be used for the image
  let filterString =
    "brightness(" +
    brightnessSlider.value +
    "%" +
    ") contrast(" +
    contrastSlider.value +
    "%" +
    ") grayscale(" +
    grayscaleSlider.value +
    "%" +
    ") saturate(" +
    saturateSlider.value +
    "%" +
    ") sepia(" +
    sepiaSlider.value +
    "%" +
    ") hue-rotate(" +
    hueRotateSlider.value +
    "deg" +
    ")";

  // Apply the filter to the image
  context.filter = filterString;

  // Draw the edited image to canvas
  context.drawImage(image, 0, 0);
}

// A series of functions that handle the preset filters
// Each of these will first reset the image
// and then apply a certain parameter before
// redrawing the image
function brightenFilter() {
  resetImage();
  brightnessSlider.value = 130;
  contrastSlider.value = 120;
  saturateSlider.value = 120;
  applyFilter();
}

function bwFilter() {
  resetImage();
  grayscaleSlider.value = 100;
  brightnessSlider.value = 120;
  contrastSlider.value = 120;
  applyFilter();
}

function funkyFilter() {
  resetImage();

  // Set a random hue rotation everytime
  hueRotateSlider.value = Math.floor(Math.random() * 360) + 1;
  contrastSlider.value = 120;
  applyFilter();
}

function vintageFilter() {
  resetImage();
  brightnessSlider.value = 120;
  saturateSlider.value = 120;
  sepiaSlider.value = 150;
  applyFilter();
}

// Reset all the slider values to there default values
function resetImage() {
  brightnessSlider.value = 100;
  contrastSlider.value = 100;
  grayscaleSlider.value = 0;
  hueRotateSlider.value = 0;
  saturateSlider.value = 100;
  sepiaSlider.value = 0;
  applyFilter();
}

function saveImage() {
  // Select the temporary element we have created for
  // helping to save the image
  let linkElement = document.getElementById("link");
  linkElement.setAttribute("download", "edited_image.png");

  // Convert the canvas data to a image data URL
  let canvasData = canvas.toDataURL("image/png");

  // Replace it with a stream so that
  // it starts downloading
  canvasData.replace("image/png", "image/octet-stream");

  // Set the location href to the canvas data
  linkElement.setAttribute("href", canvasData);

  // Click on the link to start the download
  linkElement.click();
}

// new crop JS
var imagedata = document.getElementById("image");
var cropBoxData;
var canvasData;
var cropper;
var cropControles = document.getElementById("cropControles");
var startCropBtn = document.getElementById("startCropBtn");
function startCrop() {
  imagedata.style.display = "block";
  canvas.style.display = "none";
  startCropBtn.style.display = "none";
  cropControles.style.display = "flex";
  cropper = new Cropper(imagedata, {
    autoCropArea: 0.5,
    ready: function () {
      //Should set crop box data first here
      cropper.setCropBoxData(cropBoxData).setCanvasData(canvasData);
    },
  });
}

function cropImage() {
  // Get a string base 64 data url
  cropBoxData = cropper.getCropBoxData();
  canvasData = cropper.getCanvasData();

  finalImage = cropper.getCroppedCanvas().toDataURL("image/png");
  cropper.destroy();

  // Save the image to the canvas
  imagedata.src = finalImage;
  image.src = finalImage;
  imagedata.onload = function () {
    // Hide the image and show the canvas
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.drawImage(image, 0, 0);
    imagedata.style.display = "none";
    canvas.style.display = "block";
    cropControles.style.display = "none";
    startCropBtn.style.display = "block";
  };
}

function cancelCrop() {
  cropper.destroy();
  imagedata.style.display = "none";
  canvas.style.display = "block";
  cropControles.style.display = "none";
  startCropBtn.style.display = "block";
}
