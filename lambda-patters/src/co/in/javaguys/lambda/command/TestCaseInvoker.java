package co.in.javaguys.lambda.command;

public class TestCaseInvoker {
	
	private TestCaseCommand command;
	
	public TestCaseInvoker(TestCaseCommand command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}

}
