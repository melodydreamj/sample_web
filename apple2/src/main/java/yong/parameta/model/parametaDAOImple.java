package yong.parameta.model;


import org.mybatis.spring.SqlSessionTemplate;

public class parametaDAOImple implements parametaDAO {
	//변수값설정해주고 
	private SqlSessionTemplate sqlMap;
	
	//컨스트럭트설정해주고
	public parametaDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}
	
	
	

	@Override
	public int memoWrite(parametaDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	//해당값을 디비에 삽입한다고했을때
	@Override
	public int add(parametaDTO dto) {
		int result = sqlMap.insert("add",dto);
		return result;
	}
	
	
	
	
	
}
