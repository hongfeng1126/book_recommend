package book.service;

import book.domain.dto.BorrowDTO;

import java.util.List;

/**
 * @author yutong song
 * @date 2018/3/21
 */
public interface BorrowService {

    boolean borrow(long userId, long bookId);

    List<BorrowDTO> listByUserId(long userId);

    boolean updateByBorrowId(long borrowId,int goal);

}