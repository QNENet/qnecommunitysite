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
//package com.qnenet.community.vaadinaddons.quilladdons.todo;
//
//
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//
//import java.io.IOException;
//
////@Route(value = QRoutes.TODO, layout = ContentLayout.class)
////@PageTitle("Todo")
//public class QViewTodo extends VerticalLayout {
//
////    private final AES256BinaryEncryptor encryptor;
////    private final QEditor editor;
////    private final QViewFrames viewFrames;
////    private final MainLayout mainLayout;
////    private QSessionInfo sessionInfo;
////    private Path todoPath;
////    private QMember member;
//
//    public QViewTodo() throws IOException {
////        sessionInfo = (QSessionInfo) VaadinSession.getCurrent().getAttribute(QSystemConstants.SESSION_INFO);
////        mainLayout = (MainLayout) VaadinSession.getCurrent().getAttribute(QSystemConstants.MAIN_LAYOUT);
////        if (sessionInfo.member == null) {
////            todoPath = Paths.get(sessionInfo.node.getNodeDirStr(), "todo");
////            encryptor = sessionInfo.node.getEncryptor();
////        } else {
////            todoPath = Paths.get(sessionInfo.member.getMemberDirStr(), "todo");
////            encryptor = sessionInfo.member.getEncryptor();
////        }
////        QFileUtils.checkDirectory(todoPath);
////
////        this.setSizeFull();
////
////        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
////
////
////        QEditorInfo info = new QEditorInfo();
////
////        info.autoSavePath = Paths.get(todoPath.toString(), "todoEditorAutoSave", "chapter-1", "para-1");
////        info.serialization = sessionInfo.serialization;
////        info.encryptor = null;
////        info.initialDelay = 60;
////        info.saveIntervalSeconds = 60;
////        info.undoCount = 10;
////        info.backgroundColor = "#d1f2eb";
////
////        editor = new QEditor(info);
////
////        editor.setWidthFull();
////        editor.setHeight("200px");
////
//////        editor.setHeight("90%");
//////        editor.setWidth("50%");
////
////
//////        editor.setSizeFull();
//////        VerticalLayout layout = new VerticalLayout();
//////        layout.setMargin(false);
//////        layout.setPadding(false);
//////        layout.setSpacing(false);
//////
//////
//////        layout.add(editor.getQuillEditor());
//////
//////        layout.getStyle().set("background-color", info.backgroundColor);
//////
//////        layout.setHeight("90%");
//////        layout.setWidth("50%");
////
////
////        viewFrames = new QViewFrames();
//////        Path editorPath = Paths.get(info.autoSavePath.toString(), "chapter-1");
////        viewFrames.addFrame(editor.getContent(), info.autoSavePath);
////        viewFrames.setWidth("50%");
////        viewFrames.setheight("90%%");
////
////        add(viewFrames.getContent());
//
//    }
//
//
////    @Override
////    public void beforeEnter(BeforeEnterEvent event) {
////        sessionInfo.mainLayout.enterCurrentView(this);
////        member = sessionInfo.member;
////    }
////
////    @Override
////    public void beforeLeave(BeforeLeaveEvent event) {
////        doBeforeLeave();
////    }
////
////    @Override
////    public void doBeforeLeave() {
////        editor.stopAutoSave();
////        sessionInfo.mainLayout.exitCurrentView();
////    }
//
////    @Override
////    public void beforeEnter(BeforeEnterEvent event) {
////        // this view cannot use sessionInfo.mainLayout.enterCurrentView() because
////        // mainLayout not yet available
////        sessionInfo.currentView = this;
////    }
////
////    @Override
////    public void beforeLeave(BeforeLeaveEvent event) {
////        doBeforeLeave();
////    }
////
////    @Override
////    public void doBeforeLeave() {
////        mainLayout.exitCurrentView();
////    }
////
////
////    @Override
////    public VerticalLayout getLayout() {
////        return this;
////    }
//
//}
