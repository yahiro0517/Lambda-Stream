import java.time.LocalDate;

// Comparableインターフェースを実装する
public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;
	private boolean done; // 完了はtrue,未完了はfalse
	
	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public LocalDate setDate() {
		return this.date;
	}
	
	public String getTask() {
		return task;
	}
	
	public String setTask() {
		return this.task;
	}
	
	// boolean型のetterメソッドはis～とすることもある
	public boolean isDone() {
		return done;
	}
	
	
	// compareToメソッドをオーバーライドする
	// 日付で並び変えるため、LocalDateのcompareToを使う
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}
	
	@Override
	public String toString() {
		return this.date + " " + this.task;
	}
	
}
