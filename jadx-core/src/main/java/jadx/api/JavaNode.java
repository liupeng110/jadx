package jadx.api;

/**java���Լ򵥷�װ*/
public interface JavaNode {
	String getName();                       //����
	String getFullName();                 //ȫ��
	JavaClass getDeclaringClass(); //������
	JavaClass getTopParentClass();//��������
	int getDecompiledLine();           //������ʱ������
}
