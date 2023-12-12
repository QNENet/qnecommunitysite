///*
// * Copyright 2000-2020 Vaadin Ltd.
// *
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not
// * use this file except in compliance with the License. You may obtain a copy of
// * the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// * License for the specific language governing permissions and limitations under
// * the License.
// */
//package com.qnenet.community.views.todo;
//
//
//import com.qnenet.community.constants.QRoutes;
//import com.qnenet.community.vaadinaddons.quilladdons.todo.QuillEditor;
//import com.qnenet.community.viewsmain.ContentLayout;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.router.*;
//
//import java.io.IOException;
//
//@Route(value = QRoutes.TODO, layout = ContentLayout.class)
//@PageTitle("Todo")
//public class QViewTodo extends VerticalLayout implements BeforeEnterObserver, BeforeLeaveObserver {
//
//
//    public QViewTodo() throws IOException {
//////        sessionInfo.node.newSystem();
////
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
////        add(new H1("Todo"));
//
//        QuillEditor quillEditor = new QuillEditor();
//        quillEditor.getToolbarConfigurator().noFontDecorators().noColors().initEditor();
//        quillEditor.setHeight("20em");
//        add(quillEditor);
//
//        add(new HorizontalLayout(
//                new Button("Clear Editor", event -> quillEditor.clear()),
//                new Button("Toggle ReadOnly", event -> quillEditor.setReadOnly(!quillEditor.isReadOnly()))
//        ));
//
//        Div div = new Div();
//        div.getStyle().set("overflow", "auto");
//        div.setHeight("20em");
//        div.setWidth("20em");
//        add(div);
//
//        quillEditor.addValueChangeListener(event -> {
//            div.getElement().setProperty("innerHTML", quillEditor.getValue());
//        });
//
//        this.setSizeFull();
//
//    }
//
//    @Override
//    public void beforeEnter(BeforeEnterEvent event) {
//
//
//    }
//
//    @Override
//    public void beforeLeave(BeforeLeaveEvent event) {
//
//
//    }
//
//
////    @Override
////    public Registration addAttachListener(ComponentEventListener<AttachEvent> listener) {
////        return super.addAttachListener(listener);
////    }
//
//}
