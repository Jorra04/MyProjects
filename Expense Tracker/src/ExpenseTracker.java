import java.util.HashMap;

public class ExpenseTracker {
	private String ExpenseName;
	private String category;
	private double expense;
	private HashMap<String, Double> expense_map;


	public ExpenseTracker(String expenseName, String category, double expense) {
		this.ExpenseName = expenseName;
		this.category = category;
		this.expense = expense;
		
		if(this.expense_map.containsKey(category)) {
			this.expense_map.put(category, this.expense_map.get(category) + expense);
		}
		else {
			this.expense_map.put(category, expense);
		}
	}

	public HashMap<String, Double> get_expense_map(){
		return this.expense_map;
	}
	
	public String get_expenseName() {
		return this.ExpenseName;
	}

	public String get_category() {
		return this.category;
	}

	public double get_expense() {
		return this.expense;
	}
	
	public void set_expenseName(String expense_name) {
		this.ExpenseName = expense_name;
	}

	public void set_category(String category) {
		this.category = category;
	}

	public void set_expense(double expense) {
		this.expense = expense;
	}
	
	public void add_expense(String expenseName, String category, double expense) {
		
	}

}
