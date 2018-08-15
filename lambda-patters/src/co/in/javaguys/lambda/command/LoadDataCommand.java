package co.in.javaguys.lambda.command;

public class LoadDataCommand implements TestCaseCommand {

	private TestCaseReceiver receiver;

	public LoadDataCommand(TestCaseReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.loadData();

	}

}
