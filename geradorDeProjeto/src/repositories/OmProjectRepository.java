package repositories;

import java.io.File;

import org.apache.commons.io.FileUtils;

import entities.Project;
import interfaces.IProjectRepository;

public class OmProjectRepository implements IProjectRepository {

	//AQUI NAO E NECESSARIO METODO DE PERMISSIONAMENTO POIS EM OM A PERMISSAO E HERDADA DA ESTRUTURA DO FILESERVER
	
	//DIRETORIO DOS PROJETOS DE OM
	protected static final String PATH = " DIRETORIO DO LOCAL DO PROJETO ";


	//METODO PARA CRIAR A PASTA DO PROJETO
	@Override
	public void createFolder(Project project) throws Exception {
		File folder = new File(PATH + project.getNome());

			folder.mkdir();

	}

	//PASTA PARA COPIAR A ESTRUTURA DE PASTAS PARA O PROJETO CRIADO 
	@Override
	public void copyStructure(Project project) throws Exception {

		File source = new File(
				" DIRETORIO DO LOCAL DA ESTRUTURA DE PASTA ");
		File dest = new File(PATH + project.getNome());

			FileUtils.copyDirectory(source, dest);

	}
	
	

}
