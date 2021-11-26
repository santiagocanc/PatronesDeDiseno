package towers.situations;

import towers.component;

public interface strategy {
	public abstract int Probablity();
	public abstract void exec();
	public abstract component getPJ();
}
