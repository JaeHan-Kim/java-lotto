package lotto;

import lotto.controller.LottoGame;
import lotto.view.InputView;
import lotto.view.ResultView;

public class LottoMain {
    public static void main(String[] args) {
        LottoGame lottoGame = new LottoGame(new InputView(), new ResultView());
        lottoGame.startLottoGame();
    }
}
