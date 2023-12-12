//package com.qnenet.community.vaadinaddons.quilladdons.todo;
//
//import com.qnenet.community.vaadinaddons.quill.QuillEditorComponent;
//import com.qnenet.community.vaadinaddons.quill.QuillToolbarConfigurator;
//import com.vaadin.flow.component.AbstractCompositeField;
//import com.vaadin.flow.component.HasSize;
//import com.vaadin.flow.component.HasValidation;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.component.html.Span;
//
//import static com.qnenet.qne.qvaadinapi.quill.QuillEditorComponent.EMPTY_VALUE;
//
////import static org.vaadin.klaudeta.quill.QuillEditorComponent.EMPTY_VALUE;
//
//public class QuillEditor extends AbstractCompositeField<Div, QuillEditor, String> implements HasValidation, HasSize {
//    private Span errorMessageLabel = new Span();
//    private boolean invalid;
//
//    private QuillEditorComponent quillEditorComponent = new QuillEditorComponent();
//
//    private Div div = new Div();
//
//    public QuillEditor() {
//        super(EMPTY_VALUE);
//
//        getContent().add(errorMessageLabel, quillEditorComponent, div);
//        div.addClassNames("ql-container", "ql-snow", "ql-readonly");
//        //        Hack to force scroll rather than grow if read only not called
//        div.getElement().setProperty("innerHTML", "");
//
//        div.setVisible(false);
//        quillEditorComponent.addValueChangeListener(quillValueChangeEvent -> {
//            setValue(quillValueChangeEvent.getValue());
//        });
//
//        getContent().addClassName("quill-editor");
//        errorMessageLabel.addClassName("error-message");
//        errorMessageLabel.setVisible(false);
//        quillEditorComponent.setHeight("90%");
//    }
//
//    @Override
//    protected void setPresentationValue(String newPresentationValue) {
//        _setValueBasedOnReadOnly(newPresentationValue, isReadOnly());
//    }
//
//    @Override
//    public void clear() {
//        super.clear();
//        if(isReadOnly()){
//            div.getElement().removeProperty("innerHTML");
//        }else{
//            quillEditorComponent.setHtmlContent(null);
//        }
//    }
//
//    @Override
//    public void setErrorMessage(String errorMessage) {
//        errorMessageLabel.setText(errorMessage);
//    }
//
//    @Override
//    public String getErrorMessage() {
//        return errorMessageLabel.getText();
//    }
//
//    @Override
//    public void setInvalid(boolean invalid) {
//        this.invalid = invalid;
//        errorMessageLabel.setVisible(invalid);
//        if(errorMessageLabel.isVisible()){
//            quillEditorComponent.setHeight("80%");
//        }else {
//            quillEditorComponent.setHeight("90%");
//        }
//    }
//
//    @Override
//    public boolean isInvalid() {
//        return invalid;
//    }
//
//    @Override
//    public void setReadOnly(boolean readOnly) {
//        super.setReadOnly(readOnly);
//        _setValueBasedOnReadOnly(getValue(), readOnly);
//
//    }
//
//    private void _setValueBasedOnReadOnly(String value, boolean isReadOnly){
//        if(isReadOnly){
//            div.setVisible(true);
//            div.getElement().setProperty("innerHTML", getValue());
//            quillEditorComponent.setVisible(false);
//        }else {
//            quillEditorComponent.setVisible(true);
//            quillEditorComponent.setHtmlContent(getValue());
//            div.setVisible(false);
//        }
//    }
//
//    public QuillToolbarConfigurator getToolbarConfigurator(){
//        return quillEditorComponent;
//    }
//
//}
