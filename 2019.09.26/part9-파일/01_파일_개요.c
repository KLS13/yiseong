/*
	파일 입출력
	1. 파일 스트림 (stream : 통로)을 이용해서 입출력
		1) 스트림은 단 방향으로 동작
		2) C->파일.txt (출력스트림)
			- fputc, fputs, fwrite, fprintf
		3) C<-파일.txt (입력스트림)
			- fgetc, fgets, fread, fscanf

		2. 파일 스트림 생성
			FILE* 스트림명 = open(파일명, 모드);

		3. 파일 스트림 소멸
			fclose(스트림명);

		4. 모드
			- 읽기 r(read)  : 파일이 있으면 읽어오고, 파일이 없으면 에러.
			- 쓰기 w(write) : 파일이 없으면 생성, 파일이 있으면 지우고 생성
			- 추가 a(append): 파일이 없으면 생성, 파일이 있으면 뒤에 추가
			 
*/