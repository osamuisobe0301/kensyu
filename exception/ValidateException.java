package exception;

/**
*
*MyException �����O����
*@author nakama
*
*/
public class ValidateException extends Exception{
	public ValidateException(String str){
		super(str);
	}
}
//
///**
//*
//*BlankNumberException �󔒕��������͂��ꂽ���̗�O����
//*
//*/
//class BlankNumberException extends MyException{
//		public BlankNumberException(){
//			super("�l�������Ă��܂���");
//	}
//}
//	
///**
//*
//*SelectException ������I���������͂��ꂽ���̗�O����
//*
//*/
//class SelectException extends MyException{
//    public SelectException(){
//        super("�I�������Ԉ���Ă��܂��B");
//    }
//}
//
///**
//*
//*NullShainException �Y������Ј��̃f�[�^���Ȃ��������̗�O����
//*
//*/
//class NullShainException extends MyException{
//    public NullShainException(){
//        super("�Y������Ј��͂��܂���B");
//    }
//}
//
///**
//*
//*LengthException �z��O�̌��������͂��ꂽ���̗�O����
//*
//*/
//class LengthException extends MyException{
//    public LengthException(){
//        super("�������Ԉ���Ă��܂�");
//    }
//}
//
///**
//*
//*NumberException���l�ȊO�����͂��ꂽ���̗�O����
//*
//*/
//class NumberException extends MyException{
//    public NumberException(){
//        super("���l����͂��Ă��������B");
//    }
//}
//
///**
//*
//*YakushokuException �Y�������E�����͂���Ȃ��������̗�O����
//*
//*/
//class YakushokuException extends MyException{
//    public YakushokuException(){
//        super("�Y�������E�͂���܂���");
//    }
//}
//
///**
//*
//*WorkTimeException �J�����Ԃ��z��O�̎��Ԑ����������̗�O����
//*
//*/
//class WorkTimeException extends MyException{
//    public WorkTimeException(){
//        super("�z��O�̐��l�ł��B");
//    }
//}