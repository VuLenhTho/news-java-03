package dao;

import model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends IGenericDAO<CategoryModel> {
    void insertCategory(CategoryModel categoryModel);

    void updateCategory(CategoryModel categoryModel);

    List<CategoryModel> findAllCategory();

    CategoryModel findCategoryByID(long id);
}
