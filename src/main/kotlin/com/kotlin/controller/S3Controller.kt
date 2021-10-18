package com.kotlin.controller

import com.kotlin.service.S3Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

/**
 * created by Gyunny 2021/10/18
 */
@RequestMapping("/api/v1")
@RestController
class S3Controller(
    private val s3Service: S3Service
) {

    @PostMapping("/upload")
    fun fileUpload(@RequestParam("image") multipartFile: MultipartFile): String {
        return s3Service.upload(multipartFile)
    }

}