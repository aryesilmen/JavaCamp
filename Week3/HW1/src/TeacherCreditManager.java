public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("Teacher Credit Has Calculated.");
    }

    @Override
    public void Save() {
        super.Save();
    }
}
