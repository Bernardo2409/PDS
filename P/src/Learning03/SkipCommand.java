package Learning03;

public class SkipCommand implements Command {

    private Player player;

    public SkipCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.skip();
    }
}
