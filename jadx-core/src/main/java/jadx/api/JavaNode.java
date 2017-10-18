package jadx.api;

/**java属性简单封装*/
public interface JavaNode {
	String getName();                       //名字
	String getFullName();                 //全名
	JavaClass getDeclaringClass(); //声明类
	JavaClass getTopParentClass();//顶级父类
	int getDecompiledLine();           //反编译时的行数
}
