/**
 * 
 */
package br.com.fgb.business;

import java.io.File;
import java.util.List;

import org.eclipse.jgit.lib.Repository;

/**
 * @author fillipegb
 * Interface com as operações necessárias para implementação
 * do {@link GitBusiness}.
 */
public interface GitBusiness {

	Repository createRepository(String remotePath);
	
	void cloneRepository(String remotePath, String localPath);
	
	void commit();
	
	void push();
	
	void pull();
	
	void createBranch(Repository repositorio);
	
	void addFile(File file);
	
	void addFiles(List<File> files);
}
