package oogames.action;

public interface ValidAction extends Action {


	
	@Override
	public default ValidAction evaluate() {
		return this;
	}
}
