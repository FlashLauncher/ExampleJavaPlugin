import Launcher.*;
import Launcher.base.*;
import UIL.UI;
import UIL.base.IImage;

public class ExampleJavaPlugin extends Plugin {
    public ExampleJavaPlugin(final PluginContext context) {
        super(context);
        addAccount(new IAccount() {
            @Override
            public String toString() {
                return "ExampleAccount";
            }

            @Override
            public IImage getIcon() {
                return FlashLauncher.ICON_SETTINGS;
            }

            @Override
            public void open(final IEditorContext context) {
                context.add(
                        UI.panel().size(context.width(), 48).add(
                                UI.button(LANG_REMOVE).size(context.width() - 16, 32).pos(8, 8).onAction((s, e) -> {
                                    removeAccount(this);
                                    context.close();
                                })
                        )
                );
            }

            @Override
            public void preLaunch(final RunProc configuration) {

            }

            @Override
            public void launch(final RunProc configuration) {

            }
        });
        addProfile(new IProfile() {
            @Override
            public String toString() {
                return "ExampleProfile";
            }

            @Override
            public IImage getIcon() {
                return FlashLauncher.ICON_SETTINGS;
            }

            @Override
            public void open(final IEditorContext context) {
                context.add(
                        UI.panel().size(context.width(), 48).add(
                                UI.button(LANG_REMOVE).size(context.width() - 16, 32).pos(8, 8).onAction((s, e) -> {
                                    removeProfile(this);
                                    context.close();
                                })
                        )
                );
            }

            @Override
            public void preLaunch(final RunProc configuration) {

            }

            @Override
            public void launch(final RunProc configuration) {

            }
        });
    }
}