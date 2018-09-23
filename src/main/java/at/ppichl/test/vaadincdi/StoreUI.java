package at.ppichl.test.vaadincdi;

import at.ppichl.test.vaadincdi.views.MainView;
import at.ppichl.test.vaadincdi.views.OrderView;
import com.vaadin.cdi.CDIUI;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import javax.inject.Inject;

@CDIUI("ui")
public class StoreUI extends UI {

    @Inject
    NavigationService navigationService;

    @Inject
    MainView mainView;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(mainView);
        navigationService.init(this, (ViewDisplay) mainView);
        navigationService.navigateTo(OrderView.class);
    }
}
