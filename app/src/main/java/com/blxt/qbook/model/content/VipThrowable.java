package com.blxt.qbook.model.content;

import com.blxt.qbook.MApplication;
import com.blxt.qbook.R;

public class VipThrowable extends Throwable {

    private final static String tag = "VIP_THROWABLE";

    VipThrowable() {
        super(MApplication.getInstance().getString(R.string.donate_s));
    }
}
