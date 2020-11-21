package lab05;


public class ProjectPrinter extends Project implements Runnable {
	
	private Project project;

	public ProjectPrinter(Project project) {
		super();
		this.project = project;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	public void run() {
		
		try {
			for (int i = 0; i< project.getListOfEmployee().size(); i++) {
				System.out.println("[Project ID:" + project.getProjectId() +"-Project Duration:" +
						project.getStartDate() +" to " + project.getEndDate() +"]"+ 
						"[Name:" + project.getListOfEmployee().get(i).getEmployeeName() + 
						"-Salary Per Hour:" + project.getListOfEmployee().get(i).getSalaryPerHour() +"]");
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
}
