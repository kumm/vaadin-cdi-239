package at.ppichl.test.vaadincdi;

import com.vaadin.cdi.CDINavigator;
import com.vaadin.cdi.NormalUIScoped;
import com.vaadin.cdi.internal.Conventions;
import com.vaadin.navigator.View;

@NormalUIScoped
public class NavigationService extends CDINavigator {

    public void navigateTo(Class<? extends View> targetView) {
        String viewId = getViewId(targetView);
        navigateTo(viewId);
    }

    public String getViewId(Class<? extends View> viewClass) {
        return Conventions.deriveMappingForView(viewClass);
    }

}
