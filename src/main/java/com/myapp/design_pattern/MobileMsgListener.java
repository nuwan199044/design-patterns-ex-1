package com.myapp.design_pattern;

public class MobileMsgListener implements EventListener {

    private final String mibileNo;

    public MobileMsgListener(String mibileNo) {
        this.mibileNo = mibileNo;
    }

    @Override
    public void update() {
        System.out.println("SMS is sent to: "+mibileNo);
    }
}
