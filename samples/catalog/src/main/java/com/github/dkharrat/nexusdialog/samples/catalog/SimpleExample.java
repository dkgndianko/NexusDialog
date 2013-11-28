package com.github.dkharrat.nexusdialog.samples.catalog;

import com.github.dkharrat.nexusdialog.FormActivity;
import com.github.dkharrat.nexusdialog.controllers.EditTextController;
import com.github.dkharrat.nexusdialog.controllers.FormSectionController;
import com.github.dkharrat.nexusdialog.controllers.SelectionController;

import java.util.Arrays;

/**
 * Demonstrates the bare minimum to display a form in an Activity.
 */
public class SimpleExample extends FormActivity {

    @Override protected void initForm() {
        FormSectionController section = new FormSectionController(this, "Personal Info");
        section.addElement(new EditTextController(this, "firstName", "First name", null));
        section.addElement(new EditTextController(this, "lastName", "Last name", null));
        section.addElement(new SelectionController(this, "gender", "Gender", true, "Select", Arrays.asList("Male", "Female"), true));

        addSection(section);

        setTitle("Simple Example");
    }
}
