package com.abhi.barcode.fragment.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MessageDialogs extends DialogFragment {
	
	private IDialogCreator mCreator;
	private int mWhat;
	
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return mCreator.createDialog(mWhat);
    }
}