/**
 *Copyright [2009-2010] [dennis zhuang(killme2008@gmail.com)]
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *             http://www.apache.org/licenses/LICENSE-2.0
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package net.rubyeye.xmemcached.codec;

import java.nio.ByteBuffer;

import net.rubyeye.xmemcached.command.Command;

import com.google.code.yanf4j.nio.Session;
import com.google.code.yanf4j.nio.CodecFactory.Encoder;
/**
 * memcached protocol encoder
 * @author dennis
 *
 */
public class MemcachedEncoder implements Encoder<Command> {

	@Override
	public ByteBuffer encode(Command message, Session session) {
		return message.getIoBuffer().getByteBuffer();
	}

}
