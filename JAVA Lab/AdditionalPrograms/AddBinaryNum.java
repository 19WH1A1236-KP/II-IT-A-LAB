import java.util.Scanner;
class AddBinaryNum{
public static void main(String args[]){
int i=0, carry =0;
int[] sum = new int[10];
Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary number : ");
long b1 = sc.nextLong();
System.out.print("Enter another binary number : ");
long b2 = sc.nextLong();
while (b1 != 0 || b2 != 0) 
{
sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
b1 = b1 / 10;
b2 = b2 / 10;
}
if (carry != 0) {
sum[i++] = carry;
}
--i;
System.out.print("Output: ");
while (i >= 0) {
System.out.print(sum[i--]);
}
}
}