import Launcher.base.*;
import Launcher.Plugin;
import Launcher.PluginContext;

public class ExampleJavaPlugin extends Plugin {

    public ExampleJavaPlugin(PluginContext context) {
        super(context);
        addAccount(new IAccount() {
            @Override
            public String getNickname() {
                return "ExampleAccount";
            }
        });
        addProfile(new IProfile() {
            @Override
            public String getName() {
                return "ExampleProfile";
            }
        });
    }
}