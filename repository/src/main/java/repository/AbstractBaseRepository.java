package repository;

public interface AbstractBaseRepository<T> {
	<T extends AbstractBaseRepository> T Repository();
}
