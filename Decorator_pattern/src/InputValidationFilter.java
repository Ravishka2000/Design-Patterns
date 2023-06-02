public class InputValidationFilter implements IFilter{

    IFilter iFilter;

    public InputValidationFilter(){

    }

    public InputValidationFilter(IFilter iFilter){
        this.iFilter = iFilter;
    }

    @Override
    public void execute() {
        System.out.println("Input Validation Filter");
        if (iFilter != null) {
            iFilter.execute();
        }
    }
    
}
