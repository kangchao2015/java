package top.bladeblue;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(123);
		System.out.println(0b111);
		System.out.println(123_123_222);
		System.out.println(123_123_222);
		System.out.println(123.123f);
		
        char webName1 = '΢';
        char webName2 = 'ѧ';
        char webName3 = 'Է';
        System.out.println("��վ�������ǣ�" + webName1 + webName2 + webName3);
       
        // ����
        short x=22;  // ʮ����
        int y=022;  // �˽���
        long z=0x22L;  // ʮ������
        System.out.println("ת����ʮ���ƣ�x = " + x + ", y = " + y + ", z = " + z);
       
        // ������
        float m = 22.45f;
        double n = 1000;
        System.out.println("����˻���" + m + " * " + n + "=" + m*n);
        
        // �ַ���
        boolean a = 100>10;
        boolean b = 100<10;
        System.out.println("100>10 = " + a);
        System.out.println("100<10 = " + b);
       
        if(a){
            System.out.println("100<10�ǶԵ�");
        }else{
            System.out.println("100<10�Ǵ��");
        }
	}

}
