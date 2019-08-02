package com.yinglongyhy.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class ImageUtil {
    private static String basePath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random random = new Random();

    public static String generateThumbnail(MultipartFile multipartFile, String targetAddr) {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(multipartFile);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + realFileName);
        try {
            Thumbnails.of(multipartFile.getInputStream())
                    .size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/test.png")), 0.5f)
                    .outputQuality(0.8f)
                    .toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return relativeAddr;
    }

    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File file = new File(realFileParentPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private static String getFileExtension(MultipartFile multipartFile) {
        String originalFilename = multipartFile.getOriginalFilename();
        assert originalFilename != null;
        return originalFilename.substring(originalFilename.lastIndexOf("."));
    }

    private static String getRandomFileName() {
        int rannum = random.nextInt(89999) + 10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr + rannum;
    }
}
