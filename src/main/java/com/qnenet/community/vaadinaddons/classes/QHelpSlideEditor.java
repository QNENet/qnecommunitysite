//package com.qnenet.community.vaadinaddons.classes;
//
//import com.qnenet.community.vaadinaddons.quilladdons.todo.QuillEditor;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//
//public class QHelpSlideEditor extends VerticalLayout {
//
//    private boolean isEditMode = false;
//
//    public QHelpSlideEditor(QSlideContent content) {
//
//        setSizeFull();
//        this.setAlignItems(Alignment.CENTER);
//        getStyle().set("background-color", content.getBackgroundColor());
//
//        QuillEditor quillEditor = new QuillEditor();
//        quillEditor.getToolbarConfigurator()
//                .noHeaders()
//                .noMainHeaders()
//                .noCodeBlocks()
//                .noScripts()
//                .noDirections()
//                .initEditor();
//
//
//        quillEditor.setValue(content.getHtmlStr());
////        quillEditor.setHeight("20em");
//        quillEditor.setHeight("200px");
//        quillEditor.setWidth("90%");
//        add(quillEditor);
//    }
//
////        } else {
////
////            Div div = new Div();
////            div.getStyle().set("margin-top", "auto");
////            div.getStyle().set("margin-bottom", "auto");
////            div.getStyle().set("overflow-y", "scroll");
////            div.setHeight("500px");
////
//////            div.getStyle().set("overflow-y", "scroll");
////            div.getElement().setProperty("innerHTML", htmlStr);
//////            div.setWidth("90%");
////            VerticalLayout d= new VerticalLayout(div);
////            d.setAlignItems(Alignment.CENTER);
////            d.setHeight("300px");
////            d.getStyle().set("background-color", content.getBackgroundColor());
//////            div.setHeight("20em");
//////            div.setWidth("20em");
////            add(d);
//
//
////            Div div = new Div();
////            div.getStyle().set("overflow", "auto");
////            div.setHeight("90%");
////            div.setWidth("90%");
//////            div.setHeight("20em");
//////            div.setWidth("20em");
////            add(div);
////
//////            quillEditor.addValueChangeListener(event -> {
////            div.getElement().setProperty("innerHTML", htmlStr);
//////            });
////
////            div.setSizeFull();
////            add(div);
////        add(workLayout);
////    }
////        getToolbarConfigurator()
////                .noHeaders()
////                .noMainHeaders()
////                .noCodeBlocks()
////                .noScripts()
////                .noDirections();
////        setHeight("90%");
////        setWidth("90%");
////        setValue(content);
//}
//
