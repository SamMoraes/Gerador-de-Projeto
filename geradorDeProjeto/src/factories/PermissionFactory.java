package factories;

public class PermissionFactory {

	//METODO PARA INVOCAR A BAT COM O SCRIPT DA PERMISSAO DA ESTRUTURA DE PASTA DOS PROJETOS TD
	public static void permissionProject() throws Exception{
		
		String batDirectory = " DIRETÓRIO DO SCRIPT";
	
		Runtime.getRuntime().exec("cmd.exe /c " + batDirectory); 
		
	}
	
	

}
