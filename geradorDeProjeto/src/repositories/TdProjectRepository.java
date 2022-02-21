package repositories;

import java.io.File;

import org.apache.commons.io.FileUtils;

import entities.Project;
import interfaces.IProjectRepository;

public class TdProjectRepository implements IProjectRepository {

	// DIRETORIO DOS PROJETOS DE TD
	protected static final String PATH = " DIRETORIO DO LOCAL DO PROJETO ";

	// METODO PARA CRIAR UMA PASTA GENERICA DE PROJETO
	@Override
	public void createFolder(Project project) throws Exception {

		File folder = new File(PATH + "novoTdProjeto");
		
			folder.mkdir();

		
	}

	// PASTA PARA COPIAR A ESTRUTURA DE PASTAS PARA O PROJETO CRIADO
	@Override
	public void copyStructure(Project project) throws Exception {

		File source = new File(
				" DIRETORIO DO LOCAL DA ESTRUTURA DE PASTA ");
		File dest = new File(PATH + "novoTdProjeto");

			FileUtils.copyDirectory(source, dest);

	}

	// METODO PARA RENOMEAR A PASTA GENERICA PARA O NOME DO PROJETO INSERIDO
	public void remaneFolder(Project project) throws Exception {

		File oldFolderName = new File(PATH + "novoTdProjeto");
		File newFolderName = new File(PATH + project.getNome());

			oldFolderName.renameTo(newFolderName);

	}

}
