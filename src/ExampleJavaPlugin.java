import FlashLauncher.base.IAccount;
import FlashLauncher.plugin.Plugin;
import FlashLauncher.plugin.PluginContext;

public class ExampleJavaPlugin extends Plugin {

    public ExampleJavaPlugin(final PluginContext context) {
        super(context);
        addAccount(new IAccount() {
            @Override
            public String getNickname() {
                return "ExampleAccount";
            }
        });
    }
}
