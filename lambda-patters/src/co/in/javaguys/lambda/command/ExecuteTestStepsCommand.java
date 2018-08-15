package co.in.javaguys.lambda.command;

public class ExecuteTestStepsCommand implements TestCaseCommand {

	private TestCaseReceiver receiver;

	public ExecuteTestStepsCommand(TestCaseReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.executeTestSteps();

	}

}
