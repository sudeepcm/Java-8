package co.in.javaguys.lambda.command;

public class TruncateDataCommand implements TestCaseCommand{
	
	private TestCaseReceiver receiver;
	
	public TruncateDataCommand(TestCaseReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.truncateData();
		
	}

}
