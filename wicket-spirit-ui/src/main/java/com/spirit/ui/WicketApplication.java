package com.spirit.ui;

import com.spirit.ui.pages.ConfirmBoxDemoPage;
import com.spirit.ui.pages.FootnoteDemoPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start
 * class.
 *
 * @author jiguro
 */
public class WicketApplication extends WebApplication {

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     */
    @Override
    public void init() {
        super.init();

        mountPage("demopages/footnote", FootnoteDemoPage.class);
        mountPage("demopages/confirmbox", ConfirmBoxDemoPage.class);
    }
}
