package family_tree;

import family_tree.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);

    String scan();
}
