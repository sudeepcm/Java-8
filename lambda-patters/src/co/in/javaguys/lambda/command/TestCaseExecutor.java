package co.in.javaguys.lambda.command;

import java.util.ArrayList;
import java.util.List;

public class TestCaseExecutor {

	private final List<TestCaseCommand> commands;

	public TestCaseExecutor() {
		commands = new ArrayList<>();
	}

	public void addCommand(TestCaseCommand command) {
		commands.add(command);
	}
	
	public void run() {
		commands.forEach(TestCaseCommand::execute);
	}

}
