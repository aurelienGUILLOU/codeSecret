package verrou;


import org.mockito.Mockito;

public class CodeSecret {

    CodeSecret fakeCode;

    public CodeSecret(){
        fakeCode = Mockito.mock(CodeSecret.class);
        Mockito.when(fakeCode.reveleCode()).thenReturn("good");
        Mockito.when(fakeCode.verifierCode("good")).thenReturn(true);
    }

    public String reveleCode() {
        return fakeCode.reveleCode();
    }

    public boolean verifierCode(String code){
        return fakeCode.verifierCode(code);
    }
}
