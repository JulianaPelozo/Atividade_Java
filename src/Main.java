//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Validacao solution = new Validacao();
        System.out.println(solution.isValid("(){}[]"));
        System.out.println(solution.isValid("([)]"));

        Somatorio solver = new Somatorio();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }

}
