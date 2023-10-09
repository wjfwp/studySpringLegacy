package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamconsole(exam); //DI
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);

		console.print();
		
	}
}
